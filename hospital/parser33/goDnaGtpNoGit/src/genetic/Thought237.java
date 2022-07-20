package genetic;
import java.util.ArrayList;
class Thought237 extends Thought{
private static ArrayList<Thought237> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 211.3674050302299;
private double fd1 = 822.527380597142;
private Thought fo0 = null;
private Thought fo1 = null;
Thought237 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought237 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought237 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought237 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought237 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought237 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought237 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought237 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought237 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought237 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought237 instance = new Thought237 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Output.points[5][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;

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
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Output.points[5][2] -= fd0;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought350.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 686.2933870127071;

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
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ad1;
        double ld0 = 856.9452242262455;
        boolean lb1 = false;
if(fo1 != null){
          lb1 = fo1.m2();
}
        Output.points[5][3] += ad1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
        ad2 = ad3 + ad4;
        for(int i0=0; i0<10; i0++){
            double ld2 = 877.4095890429132;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
            Output.points[5][4] -= ld0;
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
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = ad1 > ad2;
    Thought lo0 = Thought113.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = ab1 && ab2;
    fd0 = fd1 + ad1;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;

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
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Output.points[5][5] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        double ld0 = 656.4991965123759;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Thought lo1 = Thought42.getInstance(ao3, ao4, fo0, fo1);
        }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    double ld2 = 650.7656859776179;
    fb0 = fb1 && fb0;
    ld2 = fd0 - fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        fd0 = fd1 - ad1;
        for(int i1=0; i1<10; i1++){
            lb0 = fb0 && fb1;
            ad2 = ad3 - ad4;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
            fd0 = fd1 + ad1;
            Output.points[5][6] -= ad2;
            boolean lb1 = true;
            ad3 *= -1;
            double ld2 = 63.294822069932934;
            double ld3 = 122.79419397922136;
            double ld4 = 34.751448924372816;
            lb0 = fb0 || fb1;
            lb1 = lb0 && fb0;
if(ao2 != null){
              fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
            Thought lo5 = Thought60.getInstance(ad1, ad2, ad3, ad4);
            fd0 = fd1 - ld2;
            ld3 = ld4 - ad1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
        boolean lb1 = true;
if(fo0 != null){
          ab3 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        boolean lb2 = false;
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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        ab2 = !ab3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 - ad4;
        }
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought96.getInstance(fb1, fb0, fb1, fb0);
    Output.points[5][7] -= fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][8] += fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought301.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld3 = 628.4978088844108;
    boolean lb4 = true;
    fd0 *= -1;
    Thought lo5 = Thought35.getInstance();
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, lb4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb1, lb4);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      lb4 = fo0.m2(fd0, fd1, ld3, fd0, fb0, fb1, lb1, lb4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb4, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought328.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 448.7816294790852;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        double ld2 = 241.28246455956284;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld2 *= -1;
        Output.points[6][0] += ld1;
        Thought lo3 = Thought365.getInstance(ab4, fb0, fb1, ab1);
        Thought lo4 = Thought84.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld1, ab2, ab3, ab4, fb0);
        fd0 = fd1 - ld2;
        fb1 = ab1 || ab2;
        ld1 = fd0 + fd1;
if(fo1 != null){
          ld2 = fo1.m3(ld1, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        boolean lb5 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2();
}
    double ld2 = 40.91927613742162;
    Output.points[6][1] += fd0;
    boolean lb3 = false;
    lb3 = fb0 || fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[6][2] += ad3;
    ab1 = ad4 < fd0;
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad1 = ad2 + ad3;
        Thought lo1 = Thought152.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2();
}
    fb0 = fb1 || fb0;
        boolean lb0 = false;
    fb0 = !fb1;
    lb0 = !fb0;
    Thought lo1 = Thought280.getInstance(fb1, lb0, fb0, fb1);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ad2 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        Output.points[6][3] += fd1;
        fb1 = ad1 > ad2;
        fb0 = !fb1;
        double ld0 = 457.6485479781515;
        ad2 = ad3 + ad4;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = !ab2;
    double ld0 = 279.8612596491197;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 + fd1;
        }
    ld0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    double ld0 = 985.3755364063755;
if(ao1 != null){
      ld0 = ao1.m3(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 < fd1;
    boolean lb1 = false;
    ld0 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb0 = fb1 && lb1;
    fd1 *= -1;
    ab1 = ld0 < ad1;
if(ao2 != null){
      ad2 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = true;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought270.getInstance();
    Output.points[6][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld2 = 346.4663813609519;
    Thought lo3 = Thought115.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ld2;
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
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    ab3 = !ab4;
    fd1 *= -1;
    double ld1 = 920.8248030004006;
    ld1 = fd0 - fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    ab1 = ab2 && ab3;
    Output.points[6][5] += fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    Thought lo2 = Thought178.getInstance(fo0, fo1, fo0, fo1);
    lb0 = ad1 < ad2;
    ad3 *= -1;
    ad4 *= -1;
    fd0 *= -1;
    double ld3 = 467.59970532689425;
    boolean lb4 = false;
    Output.points[6][6] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, ad1, ad2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb1 = lb4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = ld3 > ad1;
    lb1 = lb4 || fb0;
    ad2 = ad3 - ad4;
    double ld5 = 99.86815666407217;

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
    boolean lb0 = false;
    lb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab1 = fd1 > ad1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        }
    fb0 = fd1 > ad1;
    fb1 = lb0 || ab1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ab1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought385.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb4, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb5 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Thought lo0 = Thought153.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    if (fb0) {
        Thought lo1 = Thought292.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
        Thought lo2 = Thought29.getInstance(fo1, ao1, ao2, ao3);
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
        double ld3 = 230.11800415663805;
        ld3 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld3);
}
        fd0 = fd1 + ld3;
        double ld4 = 291.1401826567774;
        fb1 = fb0 && fb1;
        } else if (fb0) {
        boolean lb5 = true;
        fb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[6][7] -= fd1;
        double ld6 = 4.530946255048393;
        Thought lo7 = Thought10.getInstance(fb1, lb5, fb0, fb1);
        } else if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Output.points[6][8] += fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[7][0] += fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ad4 = ao4.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        lb0 = fd0 < fd1;
        boolean lb1 = false;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb1);
}
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb1);
}
        if (lb0) {
            Output.points[7][1] += ad4;
            fb0 = !fb1;
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
        fd1 *= -1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
    lb1 = ab1 || ab2;
    Thought lo2 = Thought274.getInstance();
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb1, ab1);
}
    boolean lb3 = true;
    ab1 = !ab2;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;
    lb0 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    Output.points[7][2] -= ad2;
    double ld1 = 322.18451421826336;
    fb1 = lb0 || ab1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld2 = 281.27104898687264;
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        Thought lo3 = Thought117.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 552.1649114210737;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fd1 > ld0;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && lb1;
        fb0 = ld0 > fd0;
        if (fb1) {
if(fo0 != null){
              fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
            lb1 = !fb0;
            boolean lb2 = true;
            } else if (fb1) {
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
              fo1.m1();
}
            lb1 = fd1 < ld0;
            Thought lo3 = Thought190.getInstance(fb0, fb1, lb1, fb0);
            fd0 = fd1 - ld0;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
              ld0 = fo1.m3(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
            fb0 = !fb1;
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
    ab1 = !ab2;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    Thought lo3 = Thought286.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld4 = 105.014011661611;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Output.points[7][3] -= fd1;
if(fo0 != null){
      ld4 = fo0.m3(lb1, lb2, ab1, ab2);
}
        Thought lo5 = Thought116.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, ab3, ab4, fb0, fb1);
    fd1 *= -1;
    Output.points[7][4] += ld4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld4, fd0, lb0, lb1, lb2, ab1);
}
    ab2 = fd1 > ld4;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought12.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
        lb1 = ad2 > ad3;
    lb2 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(lb1, lb2, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought322.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
    Output.points[7][5] += ad2;
    lb1 = !lb2;
    Thought lo4 = Thought323.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
    Thought lo5 = Thought318.getInstance(fo0, fo1, fo0, fo1);

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
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought30.getInstance();
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(lb2, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        lb2 = lb0 && ab1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        Output.points[7][6] -= fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, lb0, ab1, ab2);
}
        ad1 = ad2 + ad3;
        Thought lo3 = Thought300.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
        Thought lo4 = Thought116.getInstance();
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m2(fb1, lb2, lb0, ab1);
}
        boolean lb5 = false;
        ab1 = !ab2;
        boolean lb6 = true;
        ab2 = ab3 || ab4;
        fb0 = ad4 < fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought369.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb5 = false;
    lb3 = lb4 || lb5;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, lb1, lb3, lb4);
}
    boolean lb6 = false;
    lb5 = lb6 || fb0;
        double ld7 = 972.7070995035356;
    ld7 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ld7 *= -1;
        Thought lo8 = Thought256.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld7, fd0, fb1, lb0, lb1, lb3);
if(ao1 != null){
          ao1.m1(fd1, ld7, fd0, fd1, lb4, lb5, lb6, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, lb1, lb3);
}
}
Thought.STACK_COUNTER++;
return ao1;
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
        fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought371.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    fb0 = !fb1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb1 = ao4.m2(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
    lb2 = ad3 > ad4;
    fd0 = fd1 + ad1;
    fb0 = fb1 && lb1;
    Thought lo3 = Thought366.getInstance(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb1);
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, lb2, fb0, fb1);
}
    Output.points[7][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb1 = lb2 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought43.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought74.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab2 = !ab3;
    Thought lo2 = Thought223.getInstance();
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought361.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        fb1 = ab1 && ab2;
        fd0 = fd1 - fd0;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
            boolean lb4 = true;
            fd1 *= -1;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb4, ab1, ab2, ab3);
}
            ab4 = fd0 < fd1;
            boolean lb5 = true;
            ab4 = fb0 && fb1;
            fd0 = fd1 - fd0;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
            boolean lb6 = true;
            fd1 *= -1;
            }
        ab1 = fd0 < fd1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld0 = 536.3005419087366;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[7][8] -= ad2;
    fb1 = ad3 > ad4;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
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
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 139.08105450716627;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    fb0 = !fb1;
    Thought lo1 = Thought210.getInstance();
    double ld2 = 857.1092336384786;
    fd0 *= -1;
    double ld3 = 790.5014050875892;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    ld2 = ld3 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ld2, ld3, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld2, ld3, fb1, fb0, fb1, fb0);
}
    Output.points[8][0] -= fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
    ld2 = ld3 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb4 = true;
    fb0 = fd1 < ld0;
    fb1 = ld2 > ld3;
    Output.points[8][1] += fd0;
    lb4 = fb0 && fb1;
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;

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
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 195.2487900825248;
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = !lb2;
    boolean lb3 = true;
    Thought lo4 = Thought315.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    boolean lb5 = true;
    double ld6 = 667.0573493372415;
    ld6 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3();
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
    double ld0 = 397.72019367301436;
    Thought lo1 = Thought233.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = fb0 && fb1;
    Thought lo3 = Thought156.getInstance(fd1, ld0, fd0, fd1);
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo4 = Thought294.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    fd0 *= -1;
    Thought lo5 = Thought239.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    fb1 = lb2 && fb0;

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
