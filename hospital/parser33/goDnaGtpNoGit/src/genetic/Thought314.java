package genetic;
import java.util.ArrayList;
class Thought314 extends Thought{
private static ArrayList<Thought314> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 473.47124977576095;
private double fd1 = 708.8089583916702;
private Thought fo0 = null;
private Thought fo1 = null;
Thought314 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought314 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought314 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought314 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought314 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought314 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought314 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought314 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought314 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought314 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought314 instance = new Thought314 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[1][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        Thought lo1 = Thought341.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld2 = 869.3975369500449;
    fd0 *= -1;
    lb1 = !ab1;
    boolean lb3 = true;
    double ld4 = 17.787219117514283;
    ab1 = ab2 && ab3;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][3] -= fd1;
    boolean lb0 = true;
    Thought lo1 = Thought86.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Output.points[1][4] += fd0;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[1][5] -= ad2;
    fb1 = lb0 || fb0;

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
    Output.points[1][6] += ad1;
    ab1 = ad2 < ad3;
    Thought lo0 = Thought98.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought351.getInstance();
    ab2 = ad1 < ad2;
        boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    double ld3 = 701.6361990268842;
    for(int i0=0; i0<10; i0++){
        if (ab2) {
            Output.points[1][7] -= fd0;
            ab3 = fd1 < ld3;
            } else if (ab4) {
            ad1 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought263.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = lb0 || fb0;
    fd1 = fd0 + fd1;

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
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought191.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    Thought lo1 = Thought198.getInstance();
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    double ld2 = 971.867396151504;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd0 < fd1;
    fb0 = ld2 > ad1;
    ad2 = ad3 - ad4;
        boolean lb3 = false;
    double ld4 = 238.7443734712651;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ld2, ld4, ad1, ad2);
}
        Thought lo5 = Thought375.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(fb0, fb1, lb3, fb0);
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
    double ld0 = 691.9191111543827;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Output.points[1][8] += fd1;
    Thought lo1 = Thought148.getInstance(ao2, ao3, ao4, fo0);
    ld0 = fd0 - fd1;
    ab1 = ab2 && ab3;
    ld0 = fd0 + fd1;
    ab4 = !fb0;
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1);
}
    ab1 = !ab2;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    if (ab3) {
        ab4 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          ao1.m2();
}
        Output.points[2][0] -= fd0;
        Thought lo2 = Thought365.getInstance(fb0, fb1, ab1, ab2);
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Output.points[2][1] += fd0;
    ab3 = fd1 < ad1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab3 = ao1.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
        double ld1 = 251.9887313699901;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        boolean lb2 = false;
        lb2 = !lb0;
        ab1 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ab2 = !ab3;
        ld1 = ad1 - ad2;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
        lb0 = ad3 > ad4;
        fd0 = fd1 - ld1;
        ab1 = !ab2;
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        double ld4 = 778.557093200022;
        ab2 = ab3 && ab4;
        fb0 = fb1 && lb2;
        lb3 = !lb0;
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
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    double ld0 = 669.899999686247;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 971.9628880501728;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][2] -= ld0;
    fb1 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, fd0);
}
    Thought lo2 = Thought318.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought165.getInstance(ld1, fd0, fd1, ld0);

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 995.8380826247043;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[2][3] -= ld0;
    fb0 = fb1 || lb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought101.getInstance(ld0, fd0, fd1, ld0);
        Thought lo3 = Thought210.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
        }
    boolean lb4 = false;
    ab4 = fd1 > ld0;
    if (fb0) {
        fd0 = fd1 + ld0;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, lb4, ab1);
}
        ld0 = fd0 + fd1;
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
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    double ld0 = 40.606028713798764;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld0;

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
    boolean lb0 = true;
    Output.points[2][4] += ad2;
    lb0 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    Output.points[2][5] += ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
    fb1 = !lb0;
    ab1 = ad2 < ad3;
    boolean lb1 = false;
    Output.points[2][6] -= ad4;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    double ld1 = 448.70323182401535;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return lb2;
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    lb0 = lb1 || fb0;
    Output.points[2][7] += fd0;
    fb1 = fd1 < ad1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
    lb0 = ad1 > ad2;
    boolean lb3 = false;
    if (lb1) {
        boolean lb4 = false;
        ad3 *= -1;
        Thought lo5 = Thought212.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
Thought.STACK_COUNTER++;
return lb2;
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
      ao1.m2();
}
    fd1 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    double ld1 = 140.3569502015768;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    double ld2 = 483.01500331025704;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Output.points[2][8] -= ad1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    if (ab2) {
        ad4 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ad1 = ao4.m3(ab3, ab4, fb0, fb1);
}
        ab1 = ad2 < ad3;
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 592.2796263318692;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[3][0] -= fd1;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fd1 = ld0 - fd0;
    fd1 *= -1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 || lb1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    Output.points[3][1] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
    double ld0 = 600.8236422597914;
    boolean lb1 = false;
    ab2 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    Thought lo3 = Thought97.getInstance(fd0, fd1, ld0, fd0);
    lb1 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    if (lb2) {
if(fo0 != null){
          ab1 = fo0.m2();
}
        double ld4 = 279.56809004460746;
        Thought lo5 = Thought129.getInstance(ab2, ab3, ab4, fb0);
        fb1 = fd0 < fd1;
        } else if (lb1) {
        lb2 = ld0 > fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
}
Thought.STACK_COUNTER++;
return ld0;
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
    boolean lb0 = true;
    double ld1 = 867.984065168318;
    Thought lo2 = Thought74.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
    fb1 = ld1 < ad1;
    lb0 = !fb0;
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ld1 *= -1;
    fb1 = lb0 || fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
        boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought143.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    Output.points[3][2] += ad2;

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
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = !fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb0 = true;
    Thought lo1 = Thought154.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    boolean lb2 = false;

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
        fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Thought lo1 = Thought374.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb1 = ad3 > ad4;
    Output.points[3][3] += fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ad4 = ao2.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = !ab1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    ab1 = fd0 < fd1;
    boolean lb0 = true;
    Thought lo1 = Thought43.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld2 = 419.55790239541994;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
    Thought lo0 = Thought227.getInstance();
    double ld1 = 192.88097695668804;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld2 = 618.2274944496085;
    double ld3 = 72.32899367671885;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld1);
}
    boolean lb4 = false;
    ld2 *= -1;
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    if (lb4) {
if(ao3 != null){
          ab1 = ao3.m2();
}
        double ld5 = 387.35103453365355;
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        Thought lo6 = Thought257.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld5, fb1, lb4, ab1, ab2);
        Thought lo7 = Thought107.getInstance(ld1, ld2, ld3, ad1, ab3, ab4, fb0, fb1);
        lb4 = ab1 && ab2;
        double ld8 = 481.2413886746534;
        ab3 = ad1 < ad2;
        boolean lb9 = true;
        boolean lb10 = false;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 < fd1;
    Output.points[3][4] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought130.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo2 = Thought252.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought8.getInstance(fd0, fd1, fd0, fd1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
    ab1 = fd0 < fd1;
    Thought lo0 = Thought157.getInstance();
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought315.getInstance();
    Output.points[3][5] -= fd1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought358.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        for(int i0=0; i0<10; i0++){
        fb1 = ad3 < ad4;
        for(int i1=0; i1<10; i1++){
            boolean lb1 = true;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            if (fb0) {
}}}
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    double ld0 = 287.98125570140394;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    double ld1 = 871.6147770732314;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
}
    Output.points[3][6] += ad2;
    ab1 = ab2 || ab3;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
    Thought lo3 = Thought103.getInstance(ab3, ab4, fb0, fb1);
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, lb2, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
    boolean lb4 = false;

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
    fb0 = fd0 < fd1;
    Output.points[3][7] -= fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Output.points[3][8] += fd1;
    Output.points[4][0] += fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought391.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    Output.points[4][1] -= fd0;
    lb2 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    lb0 = fd1 > fd0;
    lb2 = lb3 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        boolean lb0 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          fb0 = ao4.m2(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        Output.points[4][2] += ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo1 = Thought107.getInstance(fd1, ad1, ad2, ad3);
        ad4 *= -1;
        boolean lb2 = false;
        double ld3 = 690.4232996482448;
if(ao4 != null){
          lb2 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld3);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        Output.points[4][3] -= ad1;
        double ld4 = 2.5600199158112193;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb2, fb0);
}
        fd0 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought29.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab4 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        }
    ab1 = fd1 > fd0;
    double ld1 = 412.02523874048507;
    Output.points[4][4] += fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    Output.points[4][5] += ld1;
    boolean lb2 = true;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld1;
    fd0 *= -1;

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
    ab1 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
if(ao1 != null){
      ab1 = ao1.m2(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought223.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    ab2 = ad2 < ad3;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(ao1 != null){
      ao1.m2(lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb0, lb2, ab1, ab2);
}
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
        double ld3 = 386.7451741320362;
        double ld4 = 884.200361186708;
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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought311.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);

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
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb1 = true;
    Output.points[4][6] -= fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    lb1 = lb2 && fb0;
    fb1 = lb0 && lb1;
    lb2 = !fb0;
    Output.points[4][7] += fd0;
    Output.points[4][8] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb1, lb0, lb1, lb2);
}
    fd1 = fd0 - fd1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
}
    lb1 = !lb2;
    fd0 = fd1 + fd0;

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
    fb1 = !fb0;
    Output.points[5][0] -= fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
    lb1 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought28.getInstance(fd1, fd0, fd1, fd0);

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
