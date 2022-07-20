package genetic;
import java.util.ArrayList;
class Thought264 extends Thought{
private static ArrayList<Thought264> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 65.86103705655769;
private double fd1 = 515.5986362847875;
private Thought fo0 = null;
private Thought fo1 = null;
Thought264 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought264 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought264 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought264 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought264 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought264 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought264 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought264 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought264 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought264 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought264 instance = new Thought264 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 810.5266289294461;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought63.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    Output.points[0][0] -= fd0;
    fd1 *= -1;
    ld0 *= -1;
    fb0 = fb1 || lb1;
    double ld3 = 547.8882555748321;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    ld3 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
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
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought355.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld1 = 382.0076501734811;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld1;
    fd0 *= -1;
    Output.points[0][1] += fd1;
    if (ab1) {
        Output.points[0][2] += ld1;
        fd0 = fd1 + ld1;
        Thought lo2 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
        if (fb1) {
            ab1 = fd1 < ld1;
            fd0 = fd1 + ld1;
            fd0 = fd1 - ld1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    Thought lo0 = Thought155.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 && lb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    double ld0 = 906.0416742314133;
    fb0 = !fb1;
    Output.points[0][3] -= ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought199.getInstance();
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    ld0 = ad1 + ad2;
    Thought lo3 = Thought387.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb2, ab1);
    Output.points[0][4] -= ld0;
    ab2 = !ab3;
    boolean lb4 = true;
    ad1 = ad2 + ad3;
    ab3 = !ab4;
    Thought lo5 = Thought230.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb2, lb4);
    boolean lb6 = false;
    lb6 = ad1 > ad2;

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
    Output.points[0][5] += fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    Output.points[0][6] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought323.getInstance(fd0, fd1, fd0, fd1);
    lb2 = fb0 && fb1;
    fd0 *= -1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;

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
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    Output.points[0][7] -= ad4;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Output.points[0][8] += ad3;
    ad4 *= -1;
if(ao4 != null){
      ao4.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
        fb0 = !fb1;
    fb0 = !fb1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[1][0] -= ad4;

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
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought68.getInstance(ab2, ab3, ab4, fb0);
    double ld1 = 169.1786976097792;
    fd0 *= -1;
    Thought lo2 = Thought220.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
    ld1 = fd0 - fd1;
    Thought lo3 = Thought104.getInstance(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
    for(int i0=0; i0<10; i0++){
        double ld4 = 131.15290757924467;
        ld1 *= -1;
        fd0 = fd1 - ld4;
        ld1 = fd0 + fd1;
        ab2 = ab3 || ab4;
        ld4 *= -1;
        double ld5 = 982.3363369687418;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ld5 = ld1 - fd0;
        double ld6 = 361.69727513105033;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld4, ld5);
}
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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    if (ab2) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab3 = fd1 > ad1;
        ab4 = !fb0;
        boolean lb0 = true;
        fb0 = fb1 || lb0;
        ab1 = ad2 < ad3;
        ab2 = ad4 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
        double ld1 = 592.6386986649877;
        fd0 = fd1 + ld1;
        if (lb0) {
            boolean lb2 = false;
            boolean lb3 = false;
            double ld4 = 163.68476308547122;
            for(int i0=0; i0<10; i0++){
                ld1 = ad1 - ad2;
}}}
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[1][1] -= fd1;
    boolean lb0 = true;
    Thought lo1 = Thought323.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);

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
    Thought lo0 = Thought311.getInstance();
    fd0 = fd1 - fd0;
    double ld1 = 349.30632873694736;
    fd0 = fd1 + ld1;
    boolean lb2 = false;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < ld1;
    Thought lo3 = Thought193.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
    double ld4 = 876.6897654411565;
    ab4 = fd0 > fd1;
    ld1 = ld4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld4, fd0, fb0, fb1, lb2, ab1);
}
    ab2 = fd1 < ld1;
    ld4 = fd0 + fd1;
    Thought lo5 = Thought171.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    boolean lb6 = true;
    ld1 = ld4 - fd0;
    Thought lo7 = Thought345.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    ld1 = ld4 + fd0;
if(fo0 != null){
      fo0.m2(fd1, ld1, ld4, fd0);
}
    lb2 = fd1 > ld1;
    ld4 = fd0 + fd1;
    boolean lb8 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb9 = false;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1);
}
        lb2 = !lb6;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    if (fb0) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Output.points[1][2] += fd0;
if(fo1 != null){
          fo1.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        } else {
        fd0 = fd1 - ad1;
        boolean lb0 = true;
        boolean lb1 = true;
        Thought lo2 = Thought78.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
                lb1 = !fb0;
        Thought lo3 = Thought115.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        fb1 = lb0 || lb1;
        Output.points[1][3] -= ad2;
}
Thought.STACK_COUNTER++;
return fb0;
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
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    double ld0 = 271.80573736467943;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo2 = Thought68.getInstance(ab4, fb0, fb1, lb1);
    fd1 = ld0 + ad1;
    double ld3 = 517.4538704318023;
    Thought lo4 = Thought343.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    double ld5 = 288.7696443790426;
    fb0 = fb1 && lb1;

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
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    fd0 *= -1;
    double ld2 = 873.4167047440692;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
if(ao2 != null){
      ld2 = ao2.m3();
}
    lb0 = lb1 && fb0;
    fd0 = fd1 - ld2;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd0 = fd1 + ld2;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, fd0, lb1, lb3, fb0, fb1);
}
    boolean lb4 = true;
    lb0 = lb1 || lb3;
    lb4 = !fb0;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought45.getInstance(ao1, ao2, ao3, ao4);
    ad1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    Thought lo3 = Thought145.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
    lb2 = fb0 && fb1;
    lb1 = lb2 || fb0;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb1);
}
    Output.points[1][4] += ad4;
    if (lb2) {
}
Thought.STACK_COUNTER++;
return fb0;
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = fd1 < fd0;
    Thought lo0 = Thought117.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fb1 = !ab1;
    if (ab2) {
        fd1 = fd0 - fd1;
        ab3 = ab4 || fb0;
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[1][5] += fd1;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ab4 = ao2.m2();
}
    fb0 = fb1 && ab1;
    ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;

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
    double ld0 = 687.8889753163672;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    boolean lb1 = true;
    fd1 = ld0 + fd0;
    lb1 = fd1 > ld0;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb2 = true;
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 && lb2;

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
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    Output.points[1][6] -= fd0;
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    Output.points[1][7] += fd1;
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
    Thought lo0 = Thought81.getInstance(fd1, fd0, fd1, fd0);
    ab4 = fd1 < fd0;
    fd1 *= -1;
    boolean lb1 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad2 *= -1;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    boolean lb0 = true;
    double ld1 = 90.04348743575441;
    double ld2 = 573.6957239113384;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    Output.points[1][8] -= ld2;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 *= -1;
    lb0 = ad3 < ad4;
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    if (fb1) {
        lb0 = fd0 > fd1;
        fb0 = ld1 > ld2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        Output.points[2][0] += fd0;
if(fo0 != null){
          fo0.m3(fd1, ld1, ld2, ad1, lb0, fb0, fb1, lb0);
}
        fb0 = ad2 > ad3;
        boolean lb3 = true;
}
Thought.STACK_COUNTER++;
return ad4;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Output.points[2][1] -= fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        double ld0 = 166.51377864364477;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
        Thought lo2 = Thought170.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
        fd0 = fd1 - ld0;
        if (fb1) {
            lb1 = ad1 < ad2;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[2][2] -= fd0;
    if (fb0) {
        fb1 = lb0 || fb0;
        fb1 = lb0 || fb0;
        boolean lb1 = false;
        Thought lo2 = Thought298.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        if (fb0) {
if(ao3 != null){
              ao2 = ao3.m4();
}
            Thought lo3 = Thought17.getInstance(fb1, lb1, lb0, fb0);
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb1, lb0, fb0);
}
            Thought lo4 = Thought67.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, lb0, fb0);
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, lb0, fb0);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
        double ld0 = 734.3284139844511;
    ad1 *= -1;
    fb0 = ad2 < ad3;
    fb1 = !fb0;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m1(ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    Thought lo3 = Thought274.getInstance();
if(ao2 != null){
      ad1 = ao2.m3(lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    Output.points[2][3] += ad2;
    lb1 = ad3 < ad4;
    lb2 = fb0 || fb1;
    boolean lb4 = true;
    lb1 = lb2 || lb4;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    for(int i0=0; i0<10; i0++){
        lb4 = fb0 && fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought245.getInstance();
    fd0 = fd1 - fd0;
    Thought lo1 = Thought80.getInstance(ab2, ab3, ab4, fb0);
    Output.points[2][4] += fd1;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought91.getInstance(fd0, fd1, fd0, fd1);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = fd0 - fd1;
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
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;
if(ao1 != null){
      ad1 = ao1.m3();
}
    boolean lb0 = true;
    Output.points[2][5] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought379.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    lb0 = fd0 > fd1;
    boolean lb2 = false;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb3 = true;
        double ld4 = 204.94035783856512;
    double ld5 = 708.5118732607398;
    Output.points[2][6] -= ad3;
    ad4 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    double ld0 = 172.93054921636502;
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 *= -1;
        lb1 = fd1 < ld0;
    boolean lb3 = false;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Thought lo4 = Thought204.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, lb3, fb0, fb1);
}
    boolean lb5 = true;
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb2, lb3, lb5, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
}
        Thought lo6 = Thought135.getInstance(fo0, fo1, fo0, fo1);
        lb5 = !fb0;
        ld0 = fd0 - fd1;
        if (fb1) {
            } else if (lb1) {
            lb2 = !lb3;
            boolean lb7 = true;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    Output.points[2][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[2][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Output.points[3][0] += fd1;
    fd0 *= -1;
    boolean lb0 = true;
    Output.points[3][1] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;

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
    Output.points[3][2] -= ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = false;
    if (lb0) {
if(fo0 != null){
          fo0.m1(ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
        Output.points[3][3] -= fd1;
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        boolean lb3 = true;
        Output.points[3][4] += ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        boolean lb4 = true;
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad4 = fd0 + fd1;
        lb2 = ad1 < ad2;
        } else if (lb1) {
        ad3 *= -1;
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
        lb1 = ad1 < ad2;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        Thought lo1 = Thought145.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        lb0 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        boolean lb2 = true;
        ad4 = fd0 - fd1;
        ad1 *= -1;
        boolean lb3 = false;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ab4 = fb0 && fb1;
        boolean lb4 = true;
if(fo0 != null){
          ad1 = fo0.m3();
}
        boolean lb5 = true;
        for(int i1=0; i1<10; i1++){
            lb0 = lb2 && lb3;
            ad2 = ad3 + ad4;
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[3][5] += fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    Thought lo2 = Thought180.getInstance(ao3, ao4, fo0, fo1);
    fd0 = fd1 + fd0;
    Output.points[3][6] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ao3;
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
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb0, fb0);
}
    ad2 *= -1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
        fb0 = fb1 && lb0;
        fb0 = ad1 > ad2;
        fb1 = lb0 || fb0;
        ad3 = ad4 - fd0;
        fd1 = ad1 - ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        Output.points[3][7] -= ad1;
if(ao3 != null){
          fb1 = ao3.m2();
}
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = fd1 < fd0;
    double ld0 = 999.5681371207165;
        ab2 = ab3 || ab4;
            boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
    double ld2 = 521.2781678314266;
    Thought lo3 = Thought279.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    double ld4 = 362.5138519735256;
    ld2 = ld4 - fd0;
    fd1 *= -1;
    double ld5 = 746.6785198002907;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld2, ld4, ld5, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return ao3;
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
    ab1 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
    ab1 = fd1 > ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
    double ld0 = 919.0632852591084;
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Output.points[3][8] -= ad1;
    ab4 = ad2 > ad3;
    ad4 *= -1;
    boolean lb2 = false;
    double ld3 = 800.2832100576611;
    boolean lb4 = false;
if(ao1 != null){
      ad4 = ao1.m3();
}
    double ld5 = 552.4239405887666;
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ao3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought283.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
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
    double ld0 = 499.8793184019692;
    ld0 *= -1;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 && fb0;
    fd1 *= -1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    lb1 = !fb0;
    ld0 *= -1;
    Output.points[4][0] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3();
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 29.254002921779414;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    fb1 = ld0 > fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[4][1] -= fd1;

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
