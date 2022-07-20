package genetic;
import java.util.ArrayList;
class Thought50 extends Thought{
private static ArrayList<Thought50> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 298.6103798406929;
private double fd1 = 440.3884928112439;
private Thought fo0 = null;
private Thought fo1 = null;
Thought50 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought50 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought50 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought50 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought50 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][8] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 391.3133869959264;
    Thought lo1 = Thought128.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ld0 > fd0;
    ab1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    double ld2 = 433.7200344241236;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = ld0 > ld2;
    fb0 = fb1 && ab1;
    double ld3 = 554.6882032686023;
    ld3 *= -1;
    ab2 = !ab3;
    fd0 *= -1;
    ab4 = fd1 > ld0;
    double ld4 = 264.7953741068148;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld0 = 352.7888834184007;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fb0 = fb1 || fb0;
        double ld1 = 163.32122739310452;
        double ld2 = 646.6644604495897;
        if (fb1) {
            boolean lb3 = false;
            boolean lb4 = true;
if(fo0 != null){
              fo1 = fo0.m4(lb3, lb4, fb0, fb1);
}
            boolean lb5 = true;
            Thought lo6 = Thought17.getInstance(fo1, fo0, fo1, fo0, ld2, ld0, ad1, ad2, lb3, lb4, lb5, fb0);
if(fo1 != null){
              fo1.m3(ad3, ad4, fd0, fd1, fb1, lb3, lb4, lb5);
}
            boolean lb7 = false;
            Output.points[6][0] += ld1;
            lb7 = fb0 || fb1;
            lb3 = ld2 > ld0;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        double ld0 = 967.3869528835467;
    double ld1 = 194.62762601240863;
    ld1 = ad1 + ad2;
        Thought lo2 = Thought365.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    boolean lb3 = true;
    Thought lo4 = Thought83.getInstance(fo0, fo1, fo0, fo1);
    ad3 *= -1;
    Thought lo5 = Thought378.getInstance(ad4, fd0, fd1, ld0);
    Thought lo6 = Thought13.getInstance(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
    fb0 = !fb1;
    boolean lb7 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 394.872744234829;
    Output.points[6][1] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    if (fb1) {
        fd0 *= -1;
        fd1 = ld0 - fd0;
        fd1 *= -1;
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 + fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        double ld1 = 465.4830574793426;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb0 = ld1 > ld0;
        fd0 = fd1 + ld1;
        boolean lb2 = true;
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld1);
}
        Output.points[6][2] -= ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld0);
}
        double ld4 = 441.97423866522024;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][3] -= ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      ad2 = ao1.m3();
}
    if (fb1) {
        fb0 = ad3 > ad4;
        Output.points[6][4] += fd0;
        fb1 = fd1 < ad1;
        fb0 = fb1 || fb0;
        Output.points[6][5] -= ad2;
        fb1 = ad3 > ad4;
        Thought lo0 = Thought136.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        boolean lb1 = false;
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
        Thought lo3 = Thought298.getInstance(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb1);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        Thought lo4 = Thought62.getInstance(ad4, fd0, fd1, ad1);
        lb2 = ad2 > ad3;
        boolean lb5 = false;
        ad4 = fd0 + fd1;
        lb5 = ad1 > ad2;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb0 = true;
    fd0 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(ab4, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld2 = 697.990617161848;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought341.getInstance(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld2, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 370.708227028637;
if(fo1 != null){
      fo1.m2();
}
    ab1 = !ab2;
        boolean lb1 = true;
    ab2 = ab3 && ab4;
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = lb1 || ab1;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb2 = true;
    ab1 = fd1 > ld0;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
    Thought lo4 = Thought110.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab1 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[6][6] -= fd1;
    double ld1 = 498.30196524187807;
    Thought lo2 = Thought30.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
        if (fb0) {
            fb1 = lb0 && fb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fb1 = !lb0;
            double ld3 = 694.2128143931593;
            boolean lb4 = false;
            if (lb0) {
if(fo0 != null){
                  fo1 = fo0.m4(ld3, ld1, fd0, fd1);
}
                boolean lb5 = true;
                ld3 = ld1 - fd0;
                fd1 = ld3 + ld1;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld1);
}
                lb0 = fb0 && fb1;
                fd0 *= -1;
                fd1 = ld3 + ld1;
                Output.points[6][7] -= fd0;
                boolean lb6 = true;
                boolean lb7 = true;
if(fo0 != null){
                  fo1 = fo0.m4();
}
}}}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    fd0 *= -1;
    double ld0 = 498.06035305234593;
    ab4 = fd0 > fd1;
    double ld1 = 652.2236431136483;
    fb0 = ld0 > ld1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        fd1 = ld0 + ld1;
        boolean lb2 = false;
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
    double ld3 = 17.82396978541112;
    ld3 = fd0 + fd1;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought355.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld1 = 567.2178046719285;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought325.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    Thought lo3 = Thought342.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Output.points[6][8] += ad4;
    boolean lb4 = true;
    Thought lo5 = Thought307.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, lb4, fb0);
    fb1 = !lb4;
    Thought lo6 = Thought119.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    ab4 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 *= -1;
    ab1 = ad4 > fd0;
    double ld0 = 471.5358468109086;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    Output.points[7][0] -= fd1;
    ab1 = ld0 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    double ld3 = 537.2789476968412;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
}
    ad1 = ad2 - ad3;
    ab1 = ad4 > fd0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    double ld4 = 637.5829659949078;
    Thought lo5 = Thought164.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, ld3);
}
    double ld6 = 101.17438363219927;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 || lb0;
        boolean lb1 = true;
    lb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    Output.points[7][1] += fd0;
        boolean lb2 = false;
    boolean lb3 = true;
    lb0 = lb1 && lb2;
if(fo1 != null){
      fo1.m1();
}
    lb3 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
    lb2 = lb3 && fb0;
    fb1 = lb0 || lb1;
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, lb3, lb4, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = !fb0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought318.getInstance(ao3, ao4, fo0, fo1);
        Thought lo1 = Thought207.getInstance(ad2, ad3, ad4, fd0);
        double ld2 = 648.3730400459813;
        fb0 = fb1 && fb0;
        boolean lb3 = true;
        fd0 *= -1;
        fb0 = fd1 < ld2;
        Output.points[7][2] += ad1;
        fb1 = !lb3;
        ad2 *= -1;
        Thought lo4 = Thought113.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo0 != null){
          ld2 = fo0.m3();
}
        boolean lb5 = true;
if(ao1 != null){
          fo1 = ao1.m4(lb5, fb0, fb1, lb3);
}
        lb5 = fb0 && fb1;
        lb3 = ad1 < ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb5, fb0, fb1, lb3);
}
        ld2 *= -1;
        boolean lb6 = false;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought256.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 665.3205424166651;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    boolean lb2 = true;
    Thought lo3 = Thought395.getInstance();
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb2, ab1);
}
    boolean lb4 = true;
    Thought lo5 = Thought315.getInstance(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 - ad3;
if(ao2 != null){
      lb0 = ao2.m2(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought379.getInstance(ao3, ao4, fo0, fo1);
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2);
}
    double ld2 = 643.0725249888835;
    double ld3 = 767.9645022823669;
    Output.points[7][3] += ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 532.2317504076749;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought346.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld2 = 515.0349461407519;
    ld2 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld2, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    Thought lo1 = Thought108.getInstance();
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought129.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    double ld3 = 578.3876184433742;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    ld3 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought242.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought260.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
    ad3 *= -1;
    boolean lb2 = false;
    fb0 = ad4 > fd0;
    fb1 = lb2 && fb0;
    boolean lb3 = false;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    Output.points[7][4] += ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb2, lb3);
}
    Output.points[7][5] -= ad3;
    boolean lb4 = false;
    lb4 = !fb0;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, lb3, lb4, fb0);
}
    Output.points[7][6] += fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = ad1 > ad2;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        }
    for(int i1=0; i1<10; i1++){
        ab4 = fb0 || fb1;
        double ld1 = 102.19720531246485;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb2 = ad1 > ad2;
        Thought lo3 = Thought165.getInstance(ad3, ad4, fd0, fd1);
        ab1 = !ab2;
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    double ld0 = 386.8192917676848;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought285.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fd1 = ld0 - fd0;
    double ld2 = 353.6618831335583;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
    boolean lb0 = false;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    lb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        double ld2 = 339.76717045480694;
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    if (ab2) {
        ab3 = !ab4;
        double ld0 = 76.36940833033407;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fb0 = fb1 || ab1;
        } else {
                ab2 = !ab3;
        ab4 = fd1 < fd0;
        Output.points[7][7] -= fd1;
if(ao2 != null){
          fd0 = ao2.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
                fd1 = fd0 + fd1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
        fb1 = ab1 || ab2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb1 = true;
        lb1 = !ab1;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    ab2 = !ab3;
    ab4 = fd1 > ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        Thought lo0 = Thought78.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    Thought lo2 = Thought123.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought162.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought169.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Thought lo0 = Thought281.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    double ld1 = 494.5424342540131;
    boolean lb2 = true;
    double ld3 = 996.2485701983052;
    Thought lo4 = Thought279.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(ld1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, ld3, fd0, fd1);
}
        boolean lb5 = false;
    ld1 *= -1;
if(fo1 != null){
      ld3 = fo1.m3();
}
    fd0 = fd1 - ld1;
    double ld6 = 535.379189901778;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb5, ab1, ab2);
}
    ab3 = ld3 > ld6;
    ab4 = fb0 || fb1;
    fd0 *= -1;
    double ld7 = 907.6682763916979;
    lb2 = lb5 && ab1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ad1;
    if (fb1) {
        Thought lo1 = Thought318.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
        double ld2 = 248.83852195558373;
        fb0 = !fb1;
        fd0 = fd1 - ld2;
        lb0 = ad1 > ad2;
        ad3 = ad4 - fd0;
        Output.points[7][8] += fd1;
        boolean lb3 = true;
        lb0 = fb0 && fb1;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, lb3, lb0, fb0, fb1);
}
        Thought lo4 = Thought116.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        Thought lo5 = Thought227.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad2 = ad3 - ad4;
if(fo0 != null){
          fd0 = fo0.m3(lb3, lb0, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 - ad3;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = ad4 > fd0;
        if (fb0) {
            fb1 = !ab1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
                Thought lo0 = Thought110.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
                Thought lo1 = Thought92.getInstance();
                ad3 = ad4 + fd0;
if(fo0 != null){
                  fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
                fb1 = ab1 && ab2;
                double ld2 = 910.3209409896798;
                Thought lo3 = Thought39.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab3, ab4, fb0, fb1);
if(fo1 != null){
                  ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
                fb1 = ab1 || ab2;
                }
            boolean lb4 = false;
            ab2 = !ab3;
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Thought lo0 = Thought258.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    double ld1 = 239.1850091911597;
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld1;
    fb1 = fd0 < fd1;
if(ao4 != null){
      fb0 = ao4.m2(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fd0 = fd1 - ld1;
    fb0 = fd0 < fd1;
    double ld3 = 207.0180517422678;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought348.getInstance(ao2, ao3, ao4, fo0);
    fb0 = ad1 > ad2;
    double ld1 = 419.5736687082852;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
    boolean lb2 = false;
    fb0 = ad1 > ad2;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][0] -= fd0;
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    Thought lo1 = Thought269.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    ab1 = fd1 > fd0;
    Thought lo2 = Thought160.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
    double ld3 = 443.1241448273199;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
    if (ab4) {
        fd0 = fd1 + ld3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld3, fd0);
}
        double ld4 = 614.8974051917104;
        fb1 = lb0 && ab1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld4, ld3, fd0);
}
        double ld5 = 641.7076114037379;
if(fo1 != null){
          fo1.m1();
}
if(ao1 != null){
          ao1.m3(ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        double ld6 = 447.0009062637898;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = !lb1;
    for(int i0=0; i0<10; i0++){
        ab1 = ad1 > ad2;
        boolean lb2 = false;
        ad3 = ad4 - fd0;
        Output.points[8][1] -= fd1;
        double ld3 = 167.7604919456036;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          ao1.m3(ad4, fd0, fd1, ld3, fb0, fb1, lb2, lb0);
}
        }
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought365.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb5 = false;
    Output.points[8][2] -= fd1;
    boolean lb6 = true;
    ad1 *= -1;
    lb1 = lb5 && lb6;
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Output.points[8][3] += fd0;
    Output.points[8][4] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought357.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][5] -= fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 411.923144376562;
        fb0 = !fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[8][6] -= fd0;
    fd1 = ld0 - fd0;
    Thought lo1 = Thought323.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
    fb1 = fb0 || fb1;
    double ld2 = 927.1431549780636;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb3);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(ld0, ld2, fd0, fd1);
}
    ld0 = ld2 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
    Thought lo4 = Thought308.getInstance();
        fb1 = lb3 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought347.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb2 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    boolean lb4 = true;
    fd1 *= -1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb4 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb5 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
